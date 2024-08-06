package com.wfs.d7_qq;

import javax.sound.sampled.Line;
import java.io.*;
import java.net.Socket;
import java.util.List;

public class ServerReaderThread extends Thread{
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            String Line = null;
            while (true) {
                try {
                    Line = dis.readUTF();
                } catch (IOException e) {
                    System.out.println(socket.getRemoteSocketAddress()+"已下线~");
                    dis.close();
                    Server.sockets.remove(socket);
                    socket.close();
                    break;
                }
                sendToAll(Server.sockets,Line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void sendToAll(List<Socket> sockets,String msg) throws Exception {
        for (int i = 0; i < sockets.size(); i++) {
            OutputStream os = sockets.get(i).getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(msg);
            dos.flush();
        }
    }
}
