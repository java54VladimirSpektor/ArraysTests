package telran.arrays;

public class ArrayChar {
	private char[]array;
	public ArrayChar(char[]array) {
		this.array=array;
	}
	
	public int count (char character) {
		int c=0;
		int i=0;
		for(i =0;i<array.length;i++) {
			if(array[i]==character)c++;
		}return c;
	}
	public int compareToIgnoreCase(ArrayChar another) {
	int length=Math.min(array.length, another.array.length);
	int i=0;
	while(i<length&&Character.toUpperCase(array[i])==Character.toUpperCase(another.array[i])) {
		i++;
	}
	return i==length? array.length-another.array.length:Character.toUpperCase(array[i])-Character.toUpperCase(another.array[i]);
	}
	
	public int compareTo(ArrayChar another) {
		int length=Math.min(this.array.length, another.array.length);
		int index=0;
		while(index<length && this.array[index]==another.array[index]) {
			index++;
			
		}
		return index==length? this.array.length-another.array.length : 
			this.array[index]-another.array[index];
	}
	
	public boolean contains (char character) {
		return indexOf(character)>-1;
	}
	
	public boolean equals (char character) {
		return indexOf(character)>-1;
	}
	
	public boolean equalsIgnoreCase (ArrayChar another) {
		return compareToIgnoreCase(another)==0;
	}
	
	
	public boolean equals (ArrayChar another) {
		return compareTo(another)==0;
	}
	
	public int indexOf(char character) {
		int index=0;
		while(index<array.length&&array[index]!=character) {
			index++;
		}
		return index==array.length ?-1:index;
	}
	
	public int lastindexOf(char character) {
		int index=array.length-1;
		while(index>-1&&array[index]!=character) {
			index--;
		}
		return index;
	}
}
