public class Node {
    public int data;
    public Node next;
 
    public Node(int data) {
        this.data = data;
    }
}

Node tortoise = head;
Node hare = head;
 
boolean detectCycle() {
    // Empty and one element lists have no cycles:
    if (tortoise == null || tortoise.next == null) {
        return false;
    }
    // Keep going until there are elements in list:
    while (hare != null && hare.next != null) {
        // Advance both, but at their own speeds:
        tortoise = tortoise.next;     // 1 hop
        hare = hare.next.next;    // 2 hops
        if (tortoise == hare) {
            // hare can meet the tortoise only in a loop!
            return true;
        }
    }
    // hare found the end of the list, so no cycle:
    return false;
}
