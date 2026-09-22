// #include <iostream>
// using namespace std;

// // Node structure
// struct Node
// {
//     int data;
//     Node* next;
// };

// //? Function to insert a node at the end
// void insertEnd(Node*& head, int value)
// {
//     Node* newNode = new Node();

//     newNode->data = value;
//     newNode->next = NULL;

//     if (head == NULL)
//     {
//         head = newNode;
//         return;
//     }

//     Node* temp = head;

//     while (temp->next != NULL)
//     {
//         temp = temp->next;
//     }

//     temp->next = newNode;
// }

// //? Function to traverse and display the linked list
// void display(Node* head)
// {
//     Node* temp = head;

//     while (temp != NULL)
//     {
//         cout << temp->data << " -> ";
//         temp = temp->next;
//     }

//     cout << "NULL" << endl;
// }

// //? Function to search an element
// void search(Node* head, int value)
// {
//     Node* temp = head;
//     int position = 1;

//     while (temp != NULL)
//     {
//         if (temp->data == value)
//         {
//             cout << value << " found at position "
//                  << position << endl;
//             return;
//         }

//         temp = temp->next;
//         position++;
//     }

//     cout << value << " not found in the linked list." << endl;
// }

// //? Function to insert a node at the beginning
// void insertBeginning(Node*& head, int value)
// {
//     Node* newNode = new Node();

//     newNode->data = value;
//     newNode->next = head;

//     head = newNode;
// }

// int main()
// {
//     Node* head = NULL;

//     // Creating the original linked list
//     insertEnd(head, 10);
//     insertEnd(head, 20);
//     insertEnd(head, 30);
//     insertEnd(head, 40);
//     insertEnd(head, 50);

//     // (a) Traverse the linked list
//     cout << "Original Linked List: ";
//     display(head);

//     // (b) Search for 30
//     search(head, 30);

//     // (c) Insert 5 at the beginning
//     insertBeginning(head, 5);

//     cout << "After inserting 5 at beginning: ";
//     display(head);

//     // (d) Insert 60 at the end
//     insertEnd(head, 60);

//     cout << "After inserting 60 at end: ";
//     display(head);

//     // (e) Final linked list
//     cout << "Final Linked List: ";
//     display(head);

//     return 0;
// }

#include <iostream>
using namespace std;

struct Node
{
    int data;
    Node* next;
};

int main()
{
    // Create nodes
    Node* head = new Node();
    Node* second = new Node();
    Node* third = new Node();
    Node* fourth = new Node();
    Node* fifth = new Node();

    // Store data
    head->data = 10;
    second->data = 20;
    third->data = 30;
    fourth->data = 40;
    fifth->data = 50;

    // Connect nodes
    head->next = second;
    second->next = third;
    third->next = fourth;
    fourth->next = fifth;
    fifth->next = NULL;

    // (a) Traverse and display
    Node* temp = head;

    cout << "Original Linked List: ";

    while (temp != NULL)
    {
        cout << temp->data << " -> ";
        temp = temp->next;
    }

    cout << "NULL" << endl;


    // (b) Search for 30
    temp = head;
    int position = 1;
    int found = 0;

    while (temp != NULL)
    {
        if (temp->data == 30)
        {
            cout << "30 found at position: " << position << endl;
            found = 1;
            break;
        }

        temp = temp->next;
        position++;
    }

    if (found == 0)
    {
        cout << "30 not found" << endl;
    }


    // (c) Insert 5 at beginning
    Node* newNode = new Node();

    newNode->data = 5;
    newNode->next = head;
    head = newNode;

    cout << "After inserting 5 at beginning: ";

    temp = head;

    while (temp != NULL)
    {
        cout << temp->data << " -> ";
        temp = temp->next;
    }

    cout << "NULL" << endl;


    // (d) Insert 60 at end
    newNode = new Node();

    newNode->data = 60;
    newNode->next = NULL;

    temp = head;

    while (temp->next != NULL)
    {
        temp = temp->next;
    }

    temp->next = newNode;

    cout << "After inserting 60 at end: ";

    temp = head;

    while (temp != NULL)
    {
        cout << temp->data << " -> ";
        temp = temp->next;
    }

    cout << "NULL" << endl;


    // (e) Final linked list
    cout << "Final Linked List: ";

    temp = head;

    while (temp != NULL)
    {
        cout << temp->data << " -> ";
        temp = temp->next;
    }

    cout << "NULL" << endl;

    return 0;
}