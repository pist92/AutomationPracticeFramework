package testProjectPackage.automationpractiveframework.tasks;



public enum DataValues {

 //   LOGIN_PATH, LOGIN, LOGIN_URL, PASS_PATH, PASSWORD, INDEX_PAGE;

        LOGIN_URL("loginURL"),
        INDEX_PAGE("indexPage"),
        LOGIN_PATH("loginPath"),
        PASS_PATH("passPath"),
        LOGIN("login"),
        PASSWORD("password"),
        ELEMENT_FOR_AUTO_USER("elementForAutoUser");

    private String Data;

    public String getData() {
        return Data;
    }

    DataValues(String value) {
        this.Data = value;
    }

//    public enum LOGIN_URL {}
//    public enum INDEX_PAGE {}
//    public enum LOGIN_PATH{}
//    public enum PASS_PATH{}
//    public enum LOGIN{}
//    public enum PASSWORD{}
//    public enum ELEMENT_FOR_AUTO_USER {}
}

//    String loginURL, String indexPage,
//        String loginPath, String passPath,
//        String login, String password,
//        String elementForAutoUser