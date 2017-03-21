package m3_uf5_act3;

public class Excepciones1 {

    public boolean entreNumeros(String numero, int minimo, int maximo) {
        try {
            int numeroreal = Integer.parseInt(numero);

            return minimo < numeroreal && numeroreal < maximo;
        } catch (NumberFormatException ex) {
            System.out.println("Has posat un valor no vàlid\n" + ex);
        }
        return false;

    }

    
    public String[] recibirIpValida(String ip) throws ExcepcionIP {

        String[] partes = ip.split("\\.");
        if (partes.length != 4) {
            throw new ExcepcionIP("Has puesto una IP incorrecta");
        } else {
            return partes;
        }

    }

    public boolean comprovarIp(String ip) throws ExcepcionIP {

        String partes[] = recibirIpValida(ip);

        for (String parte : partes) {
            if (!(entreNumeros(parte, 0, 255))) {
                throw new ExcepcionIP("Rango de IP no válido");
            } else {
                return false;
            }
        }
        return true;
    }

}
