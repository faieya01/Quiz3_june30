/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz3_cc104;

import quiz3_cc104.EmptyTransaction;
import queueexample.EmptyQueueException;
import queueexample.QueueList;
import singlylinkedlist.SNode;

/**
 *
 * @author Fairy
 */
public class Quiz3_cc104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personnel<String> a1 = new Personnel(17,"Ace");
        Personnel<String> a2 = new Personnel(24,"Vayne");
        Personnel<String> a3 = new Personnel(30,"Aphelios");
        Personnel<String> a4 = new Personnel(42,"Yasou");
        Personnel<String> a5 = new Personnel(50,"Zed");
        
        SNode<String> form1 = new SNode(a1, null);
        SNode<String> form2 = new SNode(a2, null);
        SNode<String> form3 = new SNode(a3, null);
        SNode<String> form4 = new SNode(a4, null);
        SNode<String> form5 = new SNode(a5, null);
        
        QueueList<SNode> QueNum = new QueueList<>();
        QueNum.enqueue(form1);
        QueNum.enqueue(form2);
        QueNum.enqueue(form3);
        QueNum.enqueue(form4);
        QueNum.enqueue(form5);
        
      
        System.out.println("List of Transactions: \n");
        try {
            displayTransactions(QueNum);
        } catch (EmptyQueueException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("\nDequeued list");
        try {
            QueNum.dequeue();
        } catch (queueexample.EmptyQueueException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            displayTransactions(QueNum);
        } catch (EmptyQueueException ex) {
            System.out.println(ex.getMessage());
        }
         System.out.println("\nDequeued list");
        try {
            QueNum.dequeue();
        } catch (queueexample.EmptyQueueException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            displayTransactions(QueNum);
        } catch (EmptyQueueException ex) {
            System.out.println(ex.getMessage());
        }
         System.out.println("\nDequeued list");
        try {
            QueNum.dequeue();
        } catch (queueexample.EmptyQueueException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            displayTransactions(QueNum);
        } catch (EmptyQueueException ex) {
            System.out.println(ex.getMessage());
        }
         System.out.println("\nDequeued list");
        try {
            QueNum.dequeue();
        } catch (queueexample.EmptyQueueException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            displayTransactions(QueNum);
        } catch (EmptyQueueException ex) {
            System.out.println(ex.getMessage());
        }
         System.out.println("\nDequeued list");
        try {
            QueNum.dequeue();
        } catch (queueexample.EmptyQueueException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            displayTransactions(QueNum);
        } catch (EmptyQueueException ex) {
            System.out.println(ex.getMessage());
        }
          
    }
    private static void displayTransactions(QueueList<SNode> queueList) throws EmptyQueueException {
        
        try {
            SNode<Personnel> temp = queueList.first();
            for (int i = 0; i < queueList.size(); i++) {
                System.out.println("Transaction Number " + (i + 1) + ": " + temp.getElement().getName() + ", Customer ID: " + temp.getElement().getNum_que());
                temp = temp.getNext();
            }
            
        } catch (queueexample.EmptyQueueException ex) {
            System.out.println(ex.getMessage());
        }
    
    } 
    
}
