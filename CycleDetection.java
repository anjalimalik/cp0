/*
Detect a cycle in a linked list. Note that the head pointer may be 'NULL' if the list is empty.

A Node is defined as: 
    struct Node {
        int data;
        struct Node* next;
    }
*/

bool has_cycle(Node* head) {
    // Complete this function
    // Do not write the main method
    if(head == NULL){
        return false;
    }
    Node* s = head;
    Node* f = head;
    while((s != NULL)&&(f != NULL)&&(f->next != NULL)){
        s = s->next;
        f = f->next->next;
        
        if(s == f){
            return true;
        }
    }
    return false;
}
