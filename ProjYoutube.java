package projyoutube;
public class ProjYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("1 Poo");
        v[1] = new Video("12 PHP");
        v[2] = new Video("10 HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "jubs");
        g[1] = new Gafanhoto("Demi", 10, "F", "demi");
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
    
}
