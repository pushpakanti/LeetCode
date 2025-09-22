class MyLinkedList {
    class Node
    {
        int val;
        Node next;
        Node prev;
        Node (int val)
        {
            this.val= val;
        }
    }
    Node head;

    public MyLinkedList() {
        
    }
    
    public int get(int index) {
        Node temp= head;

        int i=0;  // to reach the index
        while(temp!=null)
        {
            if(i==index) return temp.val;
            temp= temp.next;
            i++;
        }
        return -1;
    }
    
    public void addAtHead(int val) {

        Node newhead= new Node(val);
        newhead.val=val;

        if(head==null)
        {
            head=newhead;
            newhead.prev=null;
        }
        else{
        newhead.next= head;
        newhead.prev=null;
        head.prev=newhead;
        head= newhead;
        }
    }
    
    public void addAtTail(int val) {
        Node temp1= head;
        Node newtail=new Node(val);
        newtail.val=val;

        if(head==null)
        {
            head=newtail;
        }
        else{
        while(temp1.next!=null)
        {
            temp1=temp1.next;
        }
        temp1.next=newtail;
        newtail.prev= temp1;
        newtail.next=null;
        }
    }

    public void addAtIndex(int index, int val) {
    Node newNode = new Node(val);
    newNode.val = val;

    if (index == 0) { // Insert at head
        newNode.next = head;
        if (head != null) head.prev = newNode;
        head = newNode;
        newNode.prev = null;
        return;
    }

    Node curr = head;
    int i = 0;
    while (curr != null && i < index - 1) {
        curr = curr.next;
        i++;
    }
    if (curr == null) return; // Index out of bounds

    newNode.next = curr.next;
    newNode.prev = curr;
    if (curr.next != null) curr.next.prev = newNode;
    curr.next = newNode;
}
    
    public void deleteAtIndex(int index) {
        Node temp3= head;
        int i=0;
        if (head==null) return;

        while(temp3!=null && i<index)
        {
            temp3=temp3.next;
            i++;
        }

        if(temp3==null) return;

        if(i==0)
        {
            head=temp3.next;
        }
        if(temp3.prev!=null) temp3.prev.next=temp3.next;
        if(temp3.next!=null) temp3.next.prev=temp3.prev;
    
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */