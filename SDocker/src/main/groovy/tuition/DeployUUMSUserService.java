package tuition;

import com.docker.utils.DeployServiceUtils;

public class DeployUUMSUserService {
    public static void main(String[] args) throws Exception {
        String servicePath = TutorpapaConstants.PATH + "UUMSService";
        String dockerName = TutorpapaConstants.DOCKERNAME;
        String serviceName = "uums";
        String gridfsHost = TutorpapaConstants.GRIDFSHOST;
        String version = "1";
        String prefix = TutorpapaConstants.PREFIX;
        DeployServiceUtils.main(new String[]{"-x", prefix, "-p", servicePath, "-d", dockerName, "-s", serviceName, "-f", gridfsHost, "-v", version});
    }
}
