// 2026.05.22

1. JpaRepository 사용시 <ENTITY클래스명, ID 타입>을 꼭 입력해줘야 함
   -> 처음에 작성 안했더니 실행시 오류 발생 및 JpaRespo에서 제공하는 기본 메서드들이 잘 작동 안함

2. 사용자가 request를 보내고 사용자에게 response를 보여줄 때 response dto에 게터가 있어야 정상적으로 보임

3. Entity 클래스인 crud 내부에서 id를 자동으로 올라가게 설정해둠
   -> PostMapping으로 게시글 생성 시 처음에 ~/crud/create/{id} 이런식으로 id를 직접 입력받았으나
   id는 데이터베이스에서 자동으로 증가하므로 입력받을 필요 없음
   ~/crud/create로 url과 Crud 클래스 생성자 수정

   
