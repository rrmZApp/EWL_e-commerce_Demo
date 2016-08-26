package example.saadat.com.ewldemo;

/**
 * Created by Saadat on 8/8/2016.
 */
public class Data {

    public Data(int img,String title1,String title2){
        this.setImg(img);
        this.setTitle1(title1);
        this.setTitle2(title2);
    }

    private int img;
    private String title1,title2;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }
}

