package FacbookUsingJAVA;

public class FacbookRun {

    public static void main(String[] args) {
        System.out.println("==============================================");
        OneLogin login = new OneLogin();

        login.openLoginPage();
    //    login.logout();

System.out.println("==============================================");

        TwoInternal internal = new TwoInternal();
        internal.openHomePage();
        internal.openProfilePage();
        internal.setNumberOfViews(10);
        internal.openFriendList();
        internal.openMessage();
        internal.openNotification();
        internal.setNumberOfViews(10);

        internal.getNumberOfViews();

        System.out.println("==============================================");

        ThreeForget forget = new ThreeForget();
        forget.new_Password();

        System.out.println("==============================================");
        login.logout();


}
}