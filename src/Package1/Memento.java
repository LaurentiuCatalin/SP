package Package1;

public class Memento {

    private IElement _state;

    public IElement get_state() {
        return _state;
    }

    public void set_state(IElement _state) {
        this._state = _state;
    }

}
