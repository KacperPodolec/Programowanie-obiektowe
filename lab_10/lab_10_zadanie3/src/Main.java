public class Main {
    public static void main(String[] args) {
        String wyrazenie = " +B+a+ł---+a+g+a---+n-+w-+l+i+t---+e-+r+k--+a+c+h---";
        Stos<Character> stos = new Stos<>();

        for (int i = 0; i < wyrazenie.length(); i++) {
            char znak = wyrazenie.charAt(i);
            if (znak == '+') {
                stos.push(wyrazenie.charAt(++i));
            } else if (znak == '-') {
                System.out.print(stos.pop());
            }
        }
    }
}