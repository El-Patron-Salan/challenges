#include <stdio.h>
#include <string.h>

int main(void){
    
    FILE *filePointer;
    char input[50];

    puts( "Open" ) ;
    filePointer = fopen("notes.txt", "w") ;

    if( filePointer == NULL ) {
        printf( "Could not open file ") ;
        return 1;
    }
    puts( "Write smth: " ) ;
    
    while( strlen ( input ) > 0 ) {
            fputs( input, filePointer ) ;
            fputs( "\n", filePointer ) ;
    }
    puts( "Closing file" ) ;
    fclose(filePointer) ;
    return 0;


}