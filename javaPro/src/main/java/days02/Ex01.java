package days02;

/**
 * @author SIST163
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("> days02.Ex01.java");
		/*
		git Init	: 작업폴더에서 	.git 생성( staging, local reposikory )
        /index
		/object
		git Status	: 확인
		git Add		: staging 에 넣기.
		git Status	: 확인
		git Commit	: git commit -m 'project_requirement 파일' v1 upload"
		git checkout -- <file>...  삭제된 파일 로컬저장소-> 작업 폴더  복원
		git Push origin master : 로컬저장소->원격저장소
		git branch	: 현재 브랜치 확인
		git clone	: 원격저장소를 팀원들이 로컬저장소로 복제해서  사용하기 위한 명령어
		Diff
		
		Log
		git Pull  origin master 로컬저장소-<-원격저장소
		Fetch
		Reset
		Revert
		Stash
		Fork
		Push
		
		working directory                staging        local repository
		project 폴더
		project_requirement 파일
		
		
		
		branching out 새로운 브랜치 생성
		merge request 병합.. code review
		
		
		staging : 로컬저장소에 저장하기 전 스냅샷            로컬저장소
		add->                       v1			  commit	
		checkout <-
*/
		
		/*
		 
		현재 작업폴더 우클릭 > git bash >  git init 하면 .git 로컬 저장소 생성
		git remote add origin "~.git" 원격저장소 연결
		git pull origin master
		git push origin master
		
		ㄱ. git status
		    깃에서 관리되지 않는 상태  untrack ->  관리상태 track (  명령어 git  add )
		ㄴ. git add [.] 변경 파일들을 모두 trackking      staging 옮김.
		git commit -m "message"
		git push origin + master
		
		Username for 'htts://github.com'   깃허브  아이디/패스워드 입력

		 * */
	}

}
