package pl.pingwit.lesson12.task3;

import org.apache.commons.lang3.RandomUtils;

import java.io.IOException;

public class Router {
    private final String name;
    private final String networkName;


    public Router(String name, String networkName) {
        this.name = name;
        this.networkName = networkName;
    }

    public String getName() {
        return name;
    }

    public String getNetworkName() {
        return networkName;
    }


    public String connectWiFi(String deviceName) throws IOException {
        if (RandomUtils.nextBoolean()) {
            throw new IOException("A connection error has been occurred, please try again later!");
        }
        return "Device " + deviceName + " successfully connected to the network " + name + " " + networkName;
    }

    @Override
    public String toString() {
        return "Router{" +
                "name='" + name + '\'' +
                ", networkName='" + networkName + '\'' +
                '}';
    }
}