#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>

#define MAX_INPUT_SZ 256

/*
 *IDEA1 - create one function to get date
 and return it somehow
 *
 *IDEA2 - create separate functions for day, month and year
 *
 *IDEA3 - read about global variable declarations and 
 make IDEA2 like that
 *
 *IDEA4 - make user input date ( it contains many exceptions )
 */

char* getDate();

int main(int argC, char *argV[]){
    //point the file   
    FILE *filePointer ;
    //dynamically allocated memory
    char *input = malloc( MAX_INPUT_SZ ) ;

    //open the file and tell which action it has to do
    filePointer = fopen("notes.txt", "a") ;
    
    //check if file exist
    if( filePointer == NULL ) {
        perror( "Could not open file ") ;
        return 1;
    }

    if( input == NULL ) {
        perror( "Memory not allocated!" ) ;
        return 1;
    }
    
    
    //loop as long as user won't terminate program
    while( !feof( stdin ) ) {
        
        //user makes input
        fgets( input, MAX_INPUT_SZ, stdin ) ;
        //put his input in file
        fputs( input, filePointer ) ;

    }
    free( input ) ;
    puts( "\nClosing file" ) ;
    fclose(filePointer) ;
    return 0;
}

char* getDate() {
    
   // time_t 

}


