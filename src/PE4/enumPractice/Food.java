package PE4.enumPractice;

public enum Food {
    BREAD ("solid"),
    MILK ("liquid"),
    COOKIES ("solid"),
    BOBA ("liquid"),
    CAKE ("solid");

    private String type;

    private Food(String type) {
        this.type = type;
    }
}
