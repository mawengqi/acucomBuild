package acucom;

import com.docker.utils.DeployServiceUtils;
import discovery.DiscoveryConstants;

/**
 * Created by wenqi on 2018/10/26
 */
public class ACUserWeb {
    public static void main(String[] args) throws Exception {
        String servicePath = DiscoveryConstants.PATH + "ACUserWeb";
        String dockerName = DiscoveryConstants.DOCKERNAME;
        String serviceName = "acuserweb";
        String gridfsHost = DiscoveryConstants.GRIDFSHOST;
        String version = "1";
        String prefix = DiscoveryConstants.PREFIX;
        DeployServiceUtils.main(new String[]{"-x", prefix, "-p", servicePath, "-d", dockerName, "-s", serviceName, "-f", gridfsHost, "-v", version});
    }
}
