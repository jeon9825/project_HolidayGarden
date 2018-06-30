﻿# 홀가분
### 전국 텃밭 분양 정보 및 농축산업 커뮤니티 SNS

# 1. Github 커밋 규칙
## 1.1. 주의사항
	1. 반드시 작업하기 전에 해당 브랜치에서 작업중인지 확인하기!
	2. 커밋 명령어는 'git commit -m'을 이용하면 편리하다.
	3. master 브랜치는 완전히 작동할 수 있는 코드만 올리는 공간이므로 되도록이면 건드리지 않는다.
	   모든 작업은 develop 하위 브랜치에서 작성한 후 merge 하는 방식으로 진행한다.

## 1.2. 브랜치명
	1. 모든 작업 브랜치는 develop의 하위 브랜치로 생성한다.
	2. 서버팀 브랜치명은 "feature/server/(기능명)"
	3. DB팀 브랜치명은 "feature/db/(기능명)"
	4. 안드로이드팀 브랜치명은 "feature/android/(기능명)"
	5. 브랜치명에 적을 기능명은 여러 커밋들을 묶어 통칭할 수 있는 이름으로 정한다.

## 1.2. 커밋 메세지
	예시) 0625 [feature/android/test] README.md 파일 추가


	1. 맨 앞에 4자리 숫자로 날짜를 입력한다.
	2. 대괄호 안에 현재 브랜치 명을 적는다
	3. 커밋 하나에는 하나의 작업만 포함시키도록 한다.


# 2. Git 명령어
## 2.1. 브랜치 관련
	git branch					현재 브랜치가 뭐뭐 있는지 확인
	git checkout (브랜치명)		다른 브랜치로 이동
	git checkout -b (브랜치명)	새로운 브랜치 생성과 동시에 이동
	git merge (목적지 브랜치명) 	'현재 브랜치' 내용을 '목적지 브랜치'에 합치기

## 2.2. 커밋 관련
	git status				최종 커밋 이후 변경된 파일이 있는지 확인 (변경된 파일은 빨간색, add된 파일은 파란색)
	git add (파일명)			변경된 파일 하나만 등록
	git add . 				변경된 모든 파일을 등록 (git status 했을 때 빨간색 파일들 전부)
	git commit				등록된 파일을 커밋
	git commit -m "메세지"	커밋메세지를 포함하여 커밋
	git log					현재 브랜치에서의 커밋 이력 확인

## 2.3. 리모트 저장소 관련
	git clone "저장소 URL"				리모트 저장소로부터 복사해오기
	git pull 							(Default) origin 리모트 저장소의 현재 브랜치 당겨오기
	git pull (저징소명) (브랜치명)		해당 저장소의 해당 브랜치 당겨오기
	git push							(Default) origin 리모트 저장소의 현재 브랜치로 내 커밋 내용 올리기
	git push (저징소명) (브랜치명)		해당 저장소의 해당 브랜치로 내 커밋 내용 올리기
	git push -u (저장소명) (브랜치명)		-u 옵션: 새로운 기능 브랜치와 동일한 이름으로 중앙 원격 저장소의 브랜치로 추가한다.
