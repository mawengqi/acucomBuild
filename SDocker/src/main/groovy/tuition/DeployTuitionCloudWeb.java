package tuition;

import com.docker.utils.DeployServiceUtils;

public class DeployTuitionCloudWeb {
    public static void main(String[] args) throws Exception {
        String servicePath = TuitionConstants.PATH + "TuitionCloudWeb";
        String dockerName = TuitionConstants.DOCKERNAME;
        String serviceName = "tcweb";
        String gridfsHost = TuitionConstants.GRIDFSHOST;
        String version = "1";
        String prefix = TuitionConstants.PREFIX;
        DeployServiceUtils.main(new String[]{"-x", prefix, "-p", servicePath, "-d", dockerName, "-s", serviceName, "-f", gridfsHost, "-v", version});
    }
}
