package FacbookUsingJAVA;

public class TwoInternal implements InternalFunction {

    TwoInternal() {
        System.out.println("=================Welcome to Facebook====================");
    }
    private static int numberOfviews = 0;

    void setNumberOfViews(int a) {

        
        this.numberOfviews += a;
        numberOfviews++;
    }
   

    void getNumberOfViews() {
        System.out.println("Number of views: " + numberOfviews);
    }

    @Override
    public void openHomePage() {
        System.out.println("Open Home Page");
    }

    @Override
    public void openProfilePage() {
        System.out.println("Open Profile Page");
    }

    @Override
    public void openFriendList() {
        System.out.println("Open Friend List");
    }

    @Override
    public void openMessage() {
        System.out.println("Open Message");
    }

    @Override
    public void openNotification() {
        System.out.println("Open Notification");
    }

}
