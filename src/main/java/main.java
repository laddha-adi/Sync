
import org.opendatakit.sync.client.SyncClient;

import java.net.URL;

import org.apache.wink.json4j.JSONException;
import org.opendatakit.sync.client.SyncClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class main {
    public static void main(String[] args) throws IOException, JSONException {

        String username = "";
        String password = "";
        SyncClient syncClient = new SyncClient();
        syncClient.init("http://ec2-18-236-164-13.us-west-2.compute.amazonaws.com", username, password);
        ArrayList<Map<String, Object>> users = syncClient.getUsers("http://ec2-18-236-164-13.us-west-2.compute.amazonaws.com/odktables", "default");
        System.out.println(users);
    }
}