public class StringEncadeadaMain{
	public static void main(String [] args){
		StringEncadeada l = new StringEncadeada("If Pizza sizes were given in area not diameter, you’d see instantly that a 7 inch is less than half the size of a 10 inch pie");
		StringEncadeada l2 = new StringEncadeada("According to the song, Rudolph’s nose is shiny, which means it reflects rather than emits light. Useless for navigating fog.");
		l.concat(l2);
		l.charAt(1);
		l.equals(l2);
		l.indexOf(1);
		l.replace('a','b');
		l.compareTo(l2);
		l.toString();
	}
}