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
		
		if(wl>ll) //찾으려는 단어가 문장보다 길면 볼 것도 없이 나가리
			cnt=0;
		if(wl==ll && line.substring(0,ll).equals(w)) //찾으려는 단어의 길이가 문장의 길이와 같으면 바로 그 둘을 비교해보면 됨
			return 1;
		
		//이제 부터는 문장의 길이가 단어보다 길 경우
		//문장의 첫번째 단어부터 비교
		  // 어차피 wl-1의 위치에서 비교를 종료함!!그래서 wl-1이라고 안써도 됨.
		if(line.substring(0,wl).equals(w)&&line.charAt(wl)==' ') {
                                          //ㄴ이 조건이 없으면 thedd도 the랑 같다고 판단해버림. the 뒤가 공백임을 확인해줌
			cnt++;
		}
		
		//문장의 마지막 단어 비교
		if(line.substring(ll-wl).equals(w)&&line.charAt(ll-wl-1)==' ') {
			                                //ㄴ이 조건이 없으면 ddsthe도 the랑 같다고 판단해버림. the 앞이 공백임을 확인해줌
			cnt++;
		}
		
		//문장의 중간 단어들 비교
		//위치 i를 시작점으로 잡아서 앞뒤로 공백이어야 하고 찾으려는 단어와 일치해야함
		for(int i=wl;i<ll-wl;i++) {
			if(line.substring(i,i+wl).equals(w)&&line.charAt(i-1)==' '&&line.charAt(i+wl)==' ') {
				                                //ㄴ첫번째 단어는 여기에     ㄴ마지막 단어는 여기에 해당이 될 수 없기 때문에 나눠서 비교를 한 것이다.
					cnt++;
			}
		}
		return cnt;
	}
}
//substring(2): 2부터(포함) 문자열 끝까지의 문자들을 리턴1
//substring(2,7):2부터(포함) 6까지(포함)의 문자들을 리턴. 7의 위치에 있는 문자는 리턴 되지 않음!!
