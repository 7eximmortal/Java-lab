// Класс циклов
// Также существует оператор break, он позволяет выйти из цикла в любой момент.
// Еще существует оператор continue, позволяет пропустить оставшийся код и перейти к след. итерации цикла.

public class CyclesStd {
	public void culcFor(int first, int less) {
		for (int i = first; i < less; i++) {
			System.out.println("[CULC FOR] Hello number = " + i);
		}
	}
	
	public void culcDo(int first, int less) {
		do {
			System.out.println("[CULC DO] Hello number = " + first);
			first++;
		} while(first < less);
	}
	
	public void culcWhile(int first, int less) {
		while(first < less) {
			System.out.println("[CULC WHILE] Hello number = " + first);
			first++;
		}
	}
}
