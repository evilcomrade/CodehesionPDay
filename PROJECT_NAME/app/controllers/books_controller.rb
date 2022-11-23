class BooksController < ApplicationController
    def index
        @books = Author.all
        render json: @books
      end
    
      def show
        @book = Book.find(params[:id])
        render json: @book
      end
    
      def create
        @book = Book.create(
            authorname:params[:authorname],
            createdby:params[:createdby],
        )
        render json: @book
      end
    
      def update
          @book = Book.find(params[:id])
          @book.update(
              authorname:params[:authorname],
              createdby:params[:createdby],
          )
          render json: @book
      end
    
      def destroy
          @book = Book.all
          @book = Book.find(params[:id])
          @book.destroy
          render json: @book
      end
    
      skip_before_action :verify_authenticity_token
end
