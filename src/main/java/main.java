
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
        agg_url = "https://odkserver-209114.appspot.com";
        appId = "odkserver-209114";

        userName = "Admin";
        password = "aggregate";
        URL url = new URL(agg_url);
        host = url.getHost();
        version = "2";

        SyncClient wc = new SyncClient();
        wc.init(host, userName, password);
        wc.getUsers(agg_url,appId);
        wc.close();
    }
}
