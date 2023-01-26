import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HexFormat;

class Solution {
    public ListNode sortList(ListNode head) {
        ListNode head1= head;
        int lenght = 1;
        if(head==null){
            return head;
        }
        while(head1.next!=null){
            lenght++;
            head1=head1.next;
        }
        Integer[] arrayVal = new Integer[lenght];
        head1=head;
        int i=0;
        while(head1 != null){
            arrayVal[i]=head1.val;
            i++;
            head1=head1.next;
        }
        Arrays.sort(arrayVal);
        head = new ListNode(arrayVal[0]);
        head1=head;
        for(i=1; i<lenght; i++){
            head.next= new ListNode(arrayVal[i]);
            head=head.next;
        }
        return head1; 
    }
}