package com.example.task;

public class mod {
int sem1[] = {25,30,25};
    int sem2[] = {25,30,25};
    int sem3[] = {25,30,25};
    int sem4[] = {25,30,25};

int[] sens (int pos) {
if (pos == 0) {
    return sem1;
    }
    else if (pos == 1) {
        return sem2;
    }
    else if (pos == 2) {
        return sem3;
    }
    else {
        return sem4;
    }
}

}