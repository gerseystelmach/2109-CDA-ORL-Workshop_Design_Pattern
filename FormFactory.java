public class FormFactory {

    public static Form createForm(Integer size, FormsEnum type) {

        if (type == FormsEnum.CIRCLE && size > 25) {
            return new RedCircle(size, type);
        }

        if (type == FormsEnum.CIRCLE && size < 25) {
            return new BlueCircle(size, type);
        }

        if (type == FormsEnum.SQUARE && size > 25) {
            return new RedSquare(size, type);
        }
        if (type == FormsEnum.SQUARE && size < 25) {
            return new BlueSquare(size, type);
        }
        return null;
    }
}
