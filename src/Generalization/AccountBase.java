package Generalization;

public interface AccountBase<T> {
	T getId();
	int getSum();
	void setSum(int sum);
}
