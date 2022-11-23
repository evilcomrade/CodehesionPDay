class AuthorsController < ApplicationController
  def index
    @authors = Author.all
    render json: @authors
  end

  def show
    @author = Author.find(params[:id])
    render json: @author
  end

  def create
    @author = Author.create(
        authorname:params[:authorname],
        createdby:params[:createdby],
    )
    render json: @author
  end

  def update
      @author = Author.find(params[:id])
      @author.update(
          authorname:params[:authorname],
          createdby:params[:createdby],
      )
      render json: @author
  end

  def destroy
      @author = Author.all
      @author = Author.find(params[:id])
      @author.destroy
      render json: @author
  end

  skip_before_action :verify_authenticity_token
end