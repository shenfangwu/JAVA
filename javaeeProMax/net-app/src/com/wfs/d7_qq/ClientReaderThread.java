package com.wfs.d7_qq;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientReaderThread extends Thread{
    private Socket socket;

    public ClientReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
            try {
                    InputStream is = socket.getInputStream();
                    DataInputStream dis = new DataInputStream(is);
                while (true) {
                    String Line = dis.readUTF();
                    System.out.println(socket.getInetAddress()+":"+socket.getLocalPort()+": "+Line);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
