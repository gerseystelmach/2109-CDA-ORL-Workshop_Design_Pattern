public class Main {
    public static void main(String[] args) {
        Form redCircle = FormFactory.createForm(26, FormsEnum.CIRCLE);
        System.out.println(redCircle.getFormType() + " " + redCircle.getClass());

        Form blueCircle = FormFactory.createForm(15, FormsEnum.CIRCLE);
        System.out.println(blueCircle.getFormType() + " " + blueCircle.getClass());

        Form redSquare = FormFactory.createForm(26, FormsEnum.SQUARE);
        System.out.println(redSquare.getFormType() + " " + redSquare.getClass());

        Form blueSquare = FormFactory.createForm(16, FormsEnum.SQUARE);
        System.out.println(blueSquare.getFormType() + " " + blueSquare.getClass());


    }
}
