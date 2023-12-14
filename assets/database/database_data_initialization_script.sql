
INSERT INTO USUARIO (USUARIO_ID, CPF, DATA_DE_NASCIMENTO, RG, EMAIL, CHAVE_PIX, NOME, RATING, SENHA)
VALUES
  (1, '123.456.789-00', '1990-01-15', '123ABC', 'user1@email.com', 'pix_user1', 'User One', 4, 'password1'),
  (2, '987.654.321-00', '1985-03-20', '456DEF', 'user2@email.com', 'pix_user2', 'User Two', 5, 'password2'),
  (3, '111.222.333-00', '1995-07-10', '789GHI', 'user3@email.com', 'pix_user3', 'User Three', 3, 'password3');


INSERT INTO AVALIACAO (AVALIACAO_ID, AVALIADO_ID, AVALIADOR_ID, STATUS, ESTRELA, DATA)
VALUES
  (1, 2, 1, 'Aprovada', 4, '2023-01-25'),
  (2, 3, 1, 'Pendente', 3, '2023-02-10'),
  (3, 1, 2, 'Rejeitada', 2, '2023-03-05');

INSERT INTO DENUNCIA (DENUNCIA_ID, DENUNCIADO_ID, DENUNCIANTE_ID, STATUS, MOTIVO, DATA)
VALUES
  (1, 3, 1, 'Em análise', 'Comportamento inadequado', '2023-04-15'),
  (2, 2, 3, 'Concluída', 'Fraude', '2023-05-02'),
  (3, 1, 2, 'Aprovada', 'Violação dos termos de uso', '2023-06-20');


INSERT INTO NOTIFICACAO (NOTIFICACAO_ID, ENVIO_ID, RECEBIMENTO_ID, STATUS, DATA, TEXTO)
VALUES
  (1, 1, 2, 'Lida', '2023-07-10', 'Mensagem de exemplo 1'),
  (2, 2, 3, 'Não lida', '2023-08-05', 'Mensagem de exemplo 2'),
  (3, 3, 1, 'Lida', '2023-09-15', 'Mensagem de exemplo 3');

INSERT INTO INGRESSO (USUARIO_ID, STATUS, IMAGEM, PRECO, DESCRICAO, DATA, CIDADE, NOME_EVENTO)
VALUES
  (1, 'Disponível', 'image1.jpg', 50.00, 'Descrição do evento 1', '2023-10-01', 'Cidade A', 'Evento One'),
  (2, 'Vendido', 'image2.jpg', 75.00, 'Descrição do evento 2', '2023-10-15', 'Cidade B', 'Evento Two'),
  (3, 'Reservado', 'image3.jpg', 60.00, 'Descrição do evento 3', '2023-11-05', 'Cidade C', 'Evento Three');


INSERT INTO VENDA (USUARIO_ID, INGRESSO_ID, DATA, STATUS, TITULARIDADE)
VALUES
  (1, 2, '2023-10-20', 'Concluída', 'Titularidade venda 1'),
  (2, 3, '2023-11-10', 'Pendente', 'Titularidade venda 2'),
  (3, 1, '2023-11-25', 'Cancelada', 'Titularidade venda 3');


INSERT INTO COMPRA (USUARIO_ID, INGRESSO_ID, DATA, STATUS, PAGAMENTO)
VALUES
  (1, 3, '2023-12-05', 'Concluída', 'Pagamento compra 1'),
  (2, 1, '2023-12-15', 'Pendente', 'Pagamento compra 2'),
  (3, 2, '2023-12-30', 'Cancelada', 'Pagamento compra 3');
