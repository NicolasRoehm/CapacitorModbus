package com.frenchstack.plugins.modbus;

//import Exceptions.ModbusException;

public class ConnectionException
extends ModbusException {
    public ConnectionException() {
    }

    public ConnectionException(String s) {
        super(s);
    }
}

