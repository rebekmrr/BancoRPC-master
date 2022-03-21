package com.gugawag.rpc.banco;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BancoServiceServer extends UnicastRemoteObject implements BancoServiceIF {

    private List<Conta> contas = new ArrayList<>();
    private Map<String, Double> saldoContas;

    public BancoServiceServer() throws RemoteException {
        saldoContas = new HashMap<>();
        saldoContas.put("1", 100.0);
        saldoContas.put("2", 156.0);
        saldoContas.put("3", 950.0);
    }

    @Override
    public double saldo(String conta) throws RemoteException {
        return saldoContas.get(conta);
    }

    @Override
    public int quantidadeContas() throws RemoteException {
        return saldoContas.size();
    }
    @Override
    public String criarConta(String numeroConta, Double saldo) throws RemoteException {
        //Utilizando o método containsKey do map para verificar se ja existe esse número de conta registrado
        if(!saldoContas.containsKey(numeroConta)){
            this.saldoContas.put(numeroConta, saldo);
            return "Conta criado com sucesso."; }
        else {
            return "Conta ja existente";
        }        
        
    }
    
    @Override
    public String adicionarConta(String numero, Double saldo) throws RemoteException {
        contas.add(new Conta(numero, saldo));
        return "Conta adicionada com sucesso.";
      
    	
    }

}