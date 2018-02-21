package br.com.mio.di.bao.heaps;

public class Execute {

	public static void main(String[] args) {
		HeapUsage heap = new HeapUsage();
		heap.add(10);
		heap.add(13);
		heap.add(7);
		heap.add(12);
		for(int v : heap.items) {
			System.out.println(v);
		}
	}
}
