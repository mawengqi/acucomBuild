package tuition;

import com.docker.utils.DeployServiceUtils;

public class DeployCallbackTaskService {
    public static void main(String[] args) throws Exception {
        String servicePath = TutorpapaConstants.PATH + "ScheduledTaskService";
        String dockerName = TutorpapaConstants.DOCKERNAME;
        String serviceName = "callback";
        String gridfsHost = TutorpapaConstants.GRIDFSHOST;
        String version = "1";
        String prefix = TutorpapaConstants.PREFIX;
        DeployServiceUtils.main(new String[]{"-x", prefix, "-p", servicePath, "-d", dockerName, "-s", serviceName, "-f", gridfsHost, "-v", version});
    }
}
