package projeto;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author aluno
 */
public class Servidor extends UnicastRemoteObject implements Calc {
    public Servidor() throws RemoteException{
        super();
    }

    @Override
    public int getSoma(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int getSubtracao(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int getMultiplicacao(int a, int b) throws RemoteException {
       return a * b;
    }

    @Override
    public double getDivisao(int a, int b) throws RemoteException {
        return a / b;
    }
}
