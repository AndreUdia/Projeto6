/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;
import java.rmi.*;
/**
 *
 * @author aluno
 */

public interface Calc extends Remote{
	public int getSoma (int a, int b) throws RemoteException;
	public int getSubtracao (int a, int b) throws RemoteException;
	public int getMultiplicacao (int a, int b) throws RemoteException;
	public double getDivisao (int a, int b) throws RemoteException;

}
