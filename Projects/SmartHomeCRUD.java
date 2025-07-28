package Projects;

import java.io.*;
import java.util.*;

abstract class SmartDevice implements Serializable {
    private String deviceId;
    private String deviceName;
    private boolean isOn;

    public SmartDevice(String deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public void turnOn() { isOn = true; }
    public void turnOff() { isOn = false; }

    public String getDeviceId() { return deviceId; }
    public String getDeviceName() { return deviceName; }
    public boolean isDeviceOn() { return isOn; }

    public abstract void performAction();
    public abstract void displayStatus();
}

class Light extends SmartDevice {
    private int brightness;

    public Light(String id, String name) {
        super(id, name);
        this.brightness = 50;
    }

    public void setBrightness(int level) {
        brightness = Math.max(0, Math.min(100, level));
    }

    @Override
    public void performAction() {
        System.out.println(getDeviceName() + " is " + (isDeviceOn() ? "illuminating" : "off") + " at brightness " + brightness + "%");
    }

    @Override
    public void displayStatus() {
        System.out.println("[Light] " + getDeviceName() + " - Status: " + (isDeviceOn() ? "ON" : "OFF") + ", Brightness: " + brightness + "%");
    }
}

class Fan extends SmartDevice {
    private int speed;

    public Fan(String id, String name) {
        super(id, name);
        this.speed = 1;
    }

    public void setSpeed(int speed) {
        this.speed = Math.max(0, Math.min(5, speed));
    }

    @Override
    public void performAction() {
        System.out.println(getDeviceName() + " is " + (isDeviceOn() ? "spinning" : "off") + " at speed " + speed);
    }

    @Override
    public void displayStatus() {
        System.out.println("[Fan] " + getDeviceName() + " - Status: " + (isDeviceOn() ? "ON" : "OFF") + ", Speed: " + speed);
    }
}

class DeviceManager {
    private final String filePath = "devices.dat";

    public void addDevice(SmartDevice device) {
        List<SmartDevice> devices = getAllDevices();
        devices.add(device);
        saveAllDevices(devices);
    }

    public List<SmartDevice> getAllDevices() {
        List<SmartDevice> list = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            list = (List<SmartDevice>) ois.readObject();
        } catch (Exception ignored) {}
        return list;
    }

    public void saveAllDevices(List<SmartDevice> devices) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("devices.dat"))) {
            oos.writeObject(devices);
        } catch (IOException e) {
            System.out.println("Error saving devices: " + e.getMessage());
        }
    }

    public void deleteDevice(String id) {
        List<SmartDevice> devices = getAllDevices();
        devices.removeIf(d -> d.getDeviceId().equalsIgnoreCase(id));
        saveAllDevices(devices);
    }

    public SmartDevice findDeviceById(String id) {
        for (SmartDevice d : getAllDevices()) {
            if (d.getDeviceId().equalsIgnoreCase(id)) {
                return d;
            }
        }
        return null;
    }
}

public class SmartHomeCRUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeviceManager manager = new DeviceManager();

        while (true) {
            System.out.println("\n1. Add Light\n2. Add Fan\n3. View All Devices\n4. Turn On Device\n5. Turn Off Device\n6. Perform Action\n7. Delete Device\n8. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID and Name: ");
                    String id = sc.next();
                    String name = sc.nextLine().trim();
                    manager.addDevice(new Light(id, name));
                }
                case 2 -> {
                    System.out.print("Enter ID and Name: ");
                    String id = sc.next();
                    String name = sc.nextLine().trim();
                    manager.addDevice(new Fan(id, name));
                }
                case 3 -> {
                    for (SmartDevice d : manager.getAllDevices()) d.displayStatus();
                }
                case 4, 5, 6 -> {
                    System.out.print("Enter Device ID: ");
                    String id = sc.next();
                    SmartDevice d = manager.findDeviceById(id);
                    if (d == null) {
                        System.out.println("Device not found.");
                        break;
                    }
                    if (choice == 4) d.turnOn();
                    else if (choice == 5) d.turnOff();
                    else d.performAction();
                    List<SmartDevice> updated = manager.getAllDevices();
                    manager.saveAllDevices(updated); // Save state
                }
                case 7 -> {
                    System.out.print("Enter ID to delete: ");
                    String id = sc.next();
                    manager.deleteDevice(id);
                }
                case 8 -> System.exit(0);
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
