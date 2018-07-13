
import org.opendatakit.sync.client.SyncClient;

import java.net.URL;

public class main {
    String agg_url;
    String appId;
    String host;
    String userName;
    String password;
    String version;

    public static void main(String[] args){
        main s = new main();
        try {
            s.setUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setUp() throws Exception {
        agg_url = "http://ec2-52-25-205-39.us-west-2.compute.amazonaws.com";
        appId = "default";

        userName = "bsmith";
        password = "pass";

        URL url = new URL(agg_url);
        host = url.getHost();

        SyncClient wc = new SyncClient();
        wc.init(host, userName, password);

       // Thread.sleep(10000);
        wc.getUsers(agg_url,appId);
        wc.close();
    }
}
