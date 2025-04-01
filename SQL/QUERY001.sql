Create database spring_crud;

use spring_crud;

CREATE TABLE IF NOT EXISTS tasks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description TEXT,
    status VARCHAR(20) NOT NULL DEFAULT '진행중',
    due_date DATE NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
); 

USE spring_crud;

INSERT INTO tasks (title, description, status, due_date) VALUES 
('스프링 MVC 프로젝트 완성하기', '스프링 5.1.0을 사용하여 CRUD 기능이 있는 웹 애플리케이션 개발', '진행중', '2024-03-25'),
('MySQL 데이터베이스 설계', '테이블 설계 및 관계 정의, 인덱스 최적화', '완료', '2024-03-20'),
('프론트엔드 디자인 개선', 'Bootstrap을 활용하여 UI/UX 개선 및 반응형 디자인 적용', '진행중', '2024-03-28'),
('단위 테스트 작성', '주요 기능에 대한 JUnit 테스트 케이스 작성', '진행중', '2024-03-30'),
('코드 리팩토링', '코드 품질 개선 및 클린 코드 적용', '진행중', '2024-04-05'),
('API 문서화', 'REST API 엔드포인트 문서화 및 예제 작성', '진행중', '2024-04-10'),
('보안 기능 구현', '로그인/로그아웃 기능 및 권한 관리 시스템 구현', '진행중', '2024-04-15'),
('배포 환경 구성', '운영 서버 설정 및 배포 자동화 구축', '진행중', '2024-04-20'); 