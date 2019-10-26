package Package1;

public class Image implements Element {
    private String _imageName;

    public String get_imageName() {
        return _imageName;
    }

    public void set_imageName(String _imageName) {
        this._imageName = _imageName;
    }

    public Image(String imageName){
        _imageName = imageName;
    }

    @Override
    public void print() {
        System.out.println("Image name: "+get_imageName());
    }
}
