class BooksController < ApplicationController
    def index
        @books = Book.all
        render json: @books
      end
    
      def show
        @book = Book.find(params[:id])
        render json: @book
      end
    
      def create
        @book = Book.new(book_params)
        @book.save
        render json: @book
      end
    
      def update
          @book = Book.find(params[:id])
          @book.update(
              bookname:params[:bookname],
              author:params[:author],
          )
          render json: @book
      end
    
      def destroy
          @book = Book.all
          @book = Book.find(params[:id])
          @book.destroy
          render json: @book
      end

      private
        def book_params
        params.require(:book).permit(:bookname, :author)
        end
    
      skip_before_action :verify_authenticity_token
end
