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
		
				// [A 경우]
		// 1. Ex02.java 추가 - ? 마크 표시 이유는 Untracked File ( == Git 관리 대상 X )
		// 2. Git에서의 파일 상태 3가지 분류
		//	Commited - 로컬 저장소에 저장
		//	Modifed - 수정한 파일을 아직 로컬 저장소에 커밋 하지 않음
		//	Staged - 수정한 파일을 곧 커밋할 것.
		// 3. Untracked File을 Staged 영역으로 추가해 주는 작업 -> 커밋 가능
		// 4. 이클립스에서 파일을 Staged 하기 위해서는 + Add to Git Index 선택
		//	                  +  마크 표시됨
		// 5. 커밋.			  db 마크 표시됨.	
		
		// 6. 로컬 저장소에 커밋한 Ex02.java 파일을 원격 저장소에 PUSH하기
		// 7. 프로젝트 우클릭>Team>Push to Upstream 클릭 후 서버에 반영.
		
		// [B경우]
		// 1. PUSH한 Ex01.java 파일을 다른 개발자가 받기
		// 2. Result Fast-forward 앞으로 빨리 감기
		
		// [C경우]
		// 1. 개발자A가 PUSH한 소스 개발자B가 받기( A 개발자 로컬저장소에 Ex02.java 파일 수정 후 커밋)
		// 2. PULL을 받으면 Update Result 상태가 Merged인 것을 확인할 수 있다.
		//    ->이는 이클립스의 머지툴이 자동적으로 로컬과 원격 저장소를 머지했다는 의미.
		
		// [D경우]
		// 1. 개발자 A가 PUSH한 소스 개발자B가 받지 않고 PUSH하기
		//  -> 이런 경우 Git Server로 부터 Rejected된다.
		//  -> 기본적으로 Git은 다른 사람이 PUSH한 후에 내가 PUSH할 수 없고
		//     ,다른 사람이 작업한 거을 가져와 머지한 후 PUSH를 해야 한다. 
		//  -> Merge 작업은 충돌되는 파일이 없다면 자동으로 해 준다.
		
		// [E경우]
		// 1. 개발자 A가 Ex01.java 파일을 수정 후 PUSH하고, 개발자 B가 Ex01.java 파일을 
		//   수정하였지만 커밋은 하지 않음..( 서로 다른 코드 라인 수정 )
		// 2. PULL을 받은 경우 Conflict 오류가 발생.
		// 3. 이런 경우 Ex01.java 파일을 커밋하고, 다시 PULL을 받아보도록 하자.
		// 4. 정상적으로 PULL을 받으며 Ex01.java파일이 Merge된다.
		// 5. PULL을 받기 전에 로컬저장소에 모두 커밋 시켜놓는 것이 이와 같은 오류 방지의 좋은 방법.
		
		// [F경우]
		// 1. 서로 같은 코드라인을 개발자 A가 수정 후 PUSH하고 , 개발자 B가 수정 후 커밋하였음
		// 2. 프로젝트 우클릭>Team>Synchronize실행 하여 수동 Merge 작업 진행.
		// 3. 이번 작업에서는 overwrite를 이용하여 원격저장소의 소스를 로컬 저장소의 소스에
		// 덮어 쓰는 방법으로 충돌을 해결하고 , 로컬 소스를 커밋하였다. 이후 PUSH하면 문제 해결.
		
//<<<<<<< HEAD 로컬 저장소 수정 코딩
		// --- Developer A Edit -------------------

//=======      원격 저장소 수정 코딩  Merge
		// --------------------------------------------------------------- github.com edit ---------
		
//>>>>>>> branch 'master' of https://github.com/keniklee/SiSt12.git
	
	    // 다시 PULL 하면 위의 코딩 나온 후 머지 후 PUSH... - 빨강 마름모 마크 표시
		
		// [G경우]
		// 1. 브랜치를 이용한 개발 진행
		// 2. 프로젝트 우클릭>Team>Switch to>New Branch
		//   - x240 입력 후 완료. 
		//   - 프로젝트 브랜치 확인 : JavaPro[LocalStorageSiSt12 x240]
		// 3. x240>Ex01.java 새로 추가 후 커밋 한다. 
		// 4. 프로젝트 우클릭>Team>Merge
	}

}
