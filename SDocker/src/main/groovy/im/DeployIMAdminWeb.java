package im;

import com.docker.utils.DeployServiceUtils;

public class DeployIMAdminWeb {
    public static void main(String[] args) throws Exception {
        String servicePath = IMConstants.PATH + "IMAdminWeb";
        String dockerName = IMConstants.DOCKERNAME;
        String serviceName = "htmls";
        String gridfsHost = IMConstants.GRIDFSHOST;
        String version = "1";
        String prefix = IMConstants.PREFIX;
        DeployServiceUtils.main(new String[]{"-x", prefix, "-p", servicePath, "-d", dockerName, "-s", serviceName, "-f", gridfsHost, "-v", version});
    }
}
