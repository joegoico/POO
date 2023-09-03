package matriz;

import java.util.Vector;

public class Matriz3D <T>{
    private Vector[][][] matriz;

    public void Matriz3D(int dim1, int dim2, int dim3) {
        matriz = new Vector[dim1][dim2][dim3];
    }

    public void asignarValor(int x, int y, int z, Object valor) {
        if (matriz[x][y][z] == null) {
            matriz[x][y][z] = new Vector();
        }
        matriz[x][y][z].add(valor);
    }

    public Object obtenerValor(int x, int y, int z) {
        if (matriz[x][y][z] != null && !matriz[x][y][z].isEmpty()) {
            return matriz[x][y][z].get(0);
        } else {
            return null;
        }
    }
}

