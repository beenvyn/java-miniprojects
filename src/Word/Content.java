package Word;

public class Content {
	private String line;
	public Content(String l) {
		line=l.trim();
	}
	public int getCount(String w) {
		int cnt=0;
		int wl=w.length();
		int ll=line.length();
		
		if(wl>ll) //ã������ �ܾ ���庸�� ��� �� �͵� ���� ������
			cnt=0;
		if(wl==ll && line.substring(0,ll).equals(w)) //ã������ �ܾ��� ���̰� ������ ���̿� ������ �ٷ� �� ���� ���غ��� ��
			return 1;
		
		//���� ���ʹ� ������ ���̰� �ܾ�� �� ���
		//������ ù��° �ܾ���� ��
		  // ������ wl-1�� ��ġ���� �񱳸� ������!!�׷��� wl-1�̶�� �Ƚᵵ ��.
		if(line.substring(0,wl).equals(w)&&line.charAt(wl)==' ') {
                                          //���� ������ ������ thedd�� the�� ���ٰ� �Ǵ��ع���. the �ڰ� �������� Ȯ������
			cnt++;
		}
		
		//������ ������ �ܾ� ��
		if(line.substring(ll-wl).equals(w)&&line.charAt(ll-wl-1)==' ') {
			                                //���� ������ ������ ddsthe�� the�� ���ٰ� �Ǵ��ع���. the ���� �������� Ȯ������
			cnt++;
		}
		
		//������ �߰� �ܾ�� ��
		//��ġ i�� ���������� ��Ƽ� �յڷ� �����̾�� �ϰ� ã������ �ܾ�� ��ġ�ؾ���
		for(int i=wl;i<ll-wl;i++) {
			if(line.substring(i,i+wl).equals(w)&&line.charAt(i-1)==' '&&line.charAt(i+wl)==' ') {
				                                //��ù��° �ܾ�� ���⿡     �������� �ܾ�� ���⿡ �ش��� �� �� ���� ������ ������ �񱳸� �� ���̴�.
					cnt++;
			}
		}
		return cnt;
	}
}
//substring(2): 2����(����) ���ڿ� �������� ���ڵ��� ����1
//substring(2,7):2����(����) 6����(����)�� ���ڵ��� ����. 7�� ��ġ�� �ִ� ���ڴ� ���� ���� ����!!
